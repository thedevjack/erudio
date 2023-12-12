package br.com.erudio;


import br.com.erudio.converter.NumberConverter;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    // cria ID conforme o objeto é criado
    private final AtomicLong counter = new AtomicLong();

    private SimpleMath math = new SimpleMath();

    // soma
    @RequestMapping(value = "/soma/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double soma(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || (!NumberConverter.isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.soma(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }

    //subtracao
    @RequestMapping(value = "/subtracao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtracao(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || (!NumberConverter.isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.subtracao(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }

    //multiplicacao
    @RequestMapping(value = "/multiplicao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplicao(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || (!NumberConverter.isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.multiplicao(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }

    //divisao
    @RequestMapping(value = "/divisao/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double divisao(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || (!NumberConverter.isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.divisao(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }

    //media
    @RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double media(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || (!NumberConverter.isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return math.media(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }

    //raizquadrada
    @RequestMapping(value = "/raizquadrada/{numberOne}", method = RequestMethod.GET)
    public Double raizquadrada(
            @PathVariable(value = "numberOne") String numberOne

    ) throws Exception {

        if (!NumberConverter.isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        Double rquadrada = Math.sqrt(NumberConverter.convertToDouble(numberOne));

        return math.raizquadrada(NumberConverter.convertToDouble(numberOne));
    }


}
