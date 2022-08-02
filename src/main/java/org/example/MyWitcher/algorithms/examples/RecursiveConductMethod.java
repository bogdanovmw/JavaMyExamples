package org.example.MyWitcher.algorithms.examples;

import java.util.ArrayList;
import java.util.List;

// Вычисление арифметического выражения из строки методом рекурсивного спуска.
public class RecursiveConductMethod {
    public static void main(String[] args) {
        String expressionTest = "22 + 3 - 2 * (2 * 5 + 2) * 4";
        List<Lexeme> lexemes = lexAnalyze(expressionTest);
        LexemeBuffer lb = new LexemeBuffer(lexemes);
        System.out.println(expr(lb));
    }

    public enum LexemeType {
        LEFT_BRACKET, RIGHT_BRACKET, OP_PLUS, OP_MINUS, OP_MUL, OP_DIV, NUMBER, EOF
    }

    public static class Lexeme {
        LexemeType type;
        String value;

        public Lexeme(LexemeType type, String value) {
            this.type = type;
            this.value = value;
        }

        public Lexeme(LexemeType type, Character value) {
            this.type = type;
            this.value = value.toString();
        }

        @Override
        public String toString() {
            return "Lexeme{" +
                    "type=" + type +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    public static class LexemeBuffer {
        private int pos;
        public List<Lexeme> lexemes;

        public LexemeBuffer(List<Lexeme> lexemes) {
            this.lexemes = lexemes;
        }

        public Lexeme next(){
            return lexemes.get(pos++);
        }

        public void back(){
            pos--;
        }

        public int getPos() {
            return pos;
        }
    }

    public static List<Lexeme> lexAnalyze(String expText){
        ArrayList<Lexeme> lexemes = new ArrayList<>();
        int pos = 0;
        while (pos < expText.length()){
            char c = expText.charAt(pos);
            switch (c) {
                case '(':
                    lexemes.add(new Lexeme(LexemeType.LEFT_BRACKET, c));
                    pos++;
                    continue;
                case ')':
                    lexemes.add(new Lexeme(LexemeType.RIGHT_BRACKET, c));
                    pos++;
                    continue;
                case '+':
                    lexemes.add(new Lexeme(LexemeType.OP_PLUS, c));
                    pos++;
                    continue;
                case '-':
                    lexemes.add(new Lexeme(LexemeType.OP_MINUS, c));
                    pos++;
                    continue;
                case '*':
                    lexemes.add(new Lexeme(LexemeType.OP_MUL, c));
                    pos++;
                    continue;
                case '/':
                    lexemes.add(new Lexeme(LexemeType.OP_DIV, c));
                    pos++;
                    continue;
                default:
                    if (c <= '9' && c >= '0'){
                        StringBuilder sb = new StringBuilder();
                        do {
                            sb.append(c);
                            pos++;
                            if (pos >= expText.length()){
                                break;
                            }
                            c = expText.charAt(pos);
                        } while (c <= '9' && c >= '0');
                        lexemes.add(new Lexeme(LexemeType.NUMBER, sb.toString()));
                    } else {
                        if (c != ' '){
                            throw new RuntimeException("Uncexpected character: " + c);
                        }
                        pos++;
                    }
            }
        }
        lexemes.add(new Lexeme(LexemeType.EOF, ""));
        return lexemes;
    }

    //    expr : plusminus* EOF ;
    //    plusminus: multdiv ( ( '+' | '-' ) multdiv )* ;
    //    multdiv : factor ( ( '*' | '/' ) factor )* ;
    //    factor : NUMBER | '(' expr ')' ;

    public static int expr(LexemeBuffer lb) {
        Lexeme lexeme = lb.next();
        if (lexeme.type == LexemeType.EOF) {
            return 0;
        } else {
            lb.back();
            return plusminus(lb);
        }
    }

    public static int plusminus(LexemeBuffer lb) {
        int value = multdiv(lb);
        while (true) {
            Lexeme lexeme = lb.next();
            switch (lexeme.type) {
                case OP_PLUS:
                    value += multdiv(lb);
                    break;
                case OP_MINUS:
                    value -= multdiv(lb);
                    break;
                case EOF:
                case RIGHT_BRACKET:
                    lb.back();
                    return value;
                default:
                    throw new RuntimeException("Error: " + lexeme.value + ", pos: " + lb.getPos());
            }
        }
    }

    public static int multdiv(LexemeBuffer lb) {
        int value = factor(lb);
        while (true) {
            Lexeme lexeme = lb.next();
            switch (lexeme.type) {
                case OP_MUL:
                    value *= factor(lb);
                    break;
                case OP_DIV:
                    value /= factor(lb);
                    break;
                case EOF:
                case RIGHT_BRACKET:
                case OP_PLUS:
                case OP_MINUS:
                    lb.back();
                    return value;
                default:
                    throw new RuntimeException("Error: " + lexeme.value + ", pos: " + lb.getPos());
            }
        }
    }

    public static int factor(LexemeBuffer lb) {
        Lexeme lexeme = lb.next();
        switch (lexeme.type){
            case NUMBER:
                return Integer.parseInt(lexeme.value);
            case LEFT_BRACKET:
                int value = expr(lb);
                lexeme = lb.next();
                if (lexeme.type != LexemeType.RIGHT_BRACKET){
                    throw new RuntimeException("Error: " + lexeme.value + ", pos: " + lb.getPos());
                }
                return value;
            default:
                throw new RuntimeException("Error: " + lexeme.value + ", pos: " + lb.getPos());
        }
    }
}
