package br.com.erudio;


import br.com.erudio.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    // cria ID conforme o objeto é criado
    private final AtomicLong counter = new AtomicLong();

    // soma
    @RequestMapping(value = "/soma/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double soma(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!isNumeric(numberOne) || (!isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    //subtracao
    @RequestMapping(value = "/subtracao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtracao(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!isNumeric(numberOne) || (!isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    //multiplicacao
    @RequestMapping(value = "/multiplicao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplicao(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!isNumeric(numberOne) || (!isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    //divisao
    @RequestMapping(value = "/divisao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double divisao(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!isNumeric(numberOne) || (!isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    //media
    @RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double media(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!isNumeric(numberOne) || (!isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertToDouble(numberOne) + convertToDouble(numberTwo) / 2;
    }

    //raizquadrada
    @RequestMapping(value = "/raizquadrada/{numberOne}", method = RequestMethod.GET)
    public Double raizquadrada(
            @PathVariable(value = "numberOne") String numberOne

    ) throws Exception {

        if (!isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        Double rquadrada = Math.sqrt(convertToDouble(numberOne));

        return rquadrada;
    }

    private Double convertToDouble(String strNumber) {
        if (strNumber == null) return 0D;
        // BR 10,25 - US 10.25
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);

        return 0D;
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }


}
