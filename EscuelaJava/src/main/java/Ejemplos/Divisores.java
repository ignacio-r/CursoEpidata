package Ejemplos;

import java.util.ArrayList;

public class Divisores {

    public static ArrayList<Integer> divisores(Integer n) {
        Integer dividendo = n;
        Integer divisor = n - 1;
        ArrayList<Integer> res = new ArrayList();
        res.add(n);
        while (divisor != 0) {
            agregarSiEsDivisor(dividendo, divisor, res);
            divisor -= 1;
        }
        return res;
    }

    private static void agregarSiEsDivisor(Integer dividendo, Integer divisor, ArrayList<Integer> res) {
        if (dividendo % divisor == 0)
            res.add(divisor);
    }

    public static void main(String[] args) {
        System.out.println(Divisores.divisores(9));
    }

}
