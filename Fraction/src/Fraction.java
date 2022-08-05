public class Fraction {
    private int numerator;
    private int denominator;
    public static boolean notZero = true; //case denominator=0 -> error

    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        if(denominator==0){
            notZero = false;
        }
    }
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public int getNumerator(){
        return numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    public int getDenominator(){
        return denominator;
    }
    public String toString(){
        if(notZero){
            reduce(this.numerator,this.denominator);
            if(this.denominator==1){
                return getNumerator()+"";
            }else {
                return getNumerator() +"/" +getDenominator();
            }
        }else {
            return "Error";
        }

    }
    public void add(Fraction f){
        if(notZero){
            if(this.denominator==f.denominator){
                setNumerator(this.numerator+f.numerator);
            }else { //คูณไขว้
                setNumerator((this.numerator*f.denominator)+(f.numerator*this.denominator));
                setDenominator(this.denominator*f.denominator);
            }
        }
    }
    public void subtract(Fraction f){
        if(notZero){
            if(this.denominator==f.denominator){
                setNumerator(this.numerator-f.numerator);
            }else { //คูณไขว้
                setNumerator((this.numerator*f.denominator)-(f.numerator*this.denominator));
                setDenominator(this.denominator*f.denominator);
            }
        }
    }
    public void multiply(Fraction f){
        if(notZero){
            setNumerator(this.numerator*f.numerator);
            setDenominator(this.denominator*f.denominator);
        }
    }
    public void divide(Fraction f){
        if(notZero){
            setNumerator(this.numerator/f.numerator);
            setDenominator(this.denominator/f.denominator);
        }

    }
    public void reduce(int numerator,int denominator){ //factor
        if(numerator<denominator){
            for(int i=2;i<=numerator;i++){
                if(numerator%i==0 && denominator%i==0){
                    setNumerator(numerator/i);
                    setDenominator(denominator/i);
                }
            }
        }else if(numerator>denominator){
            for(int i=2;i<=denominator;i++){
                if(denominator%i==0 && numerator%i==0){
                    setNumerator(numerator/i);
                    setDenominator(denominator/i);
                }
            }
        }else{ //numerator==denominator
            setNumerator(1);
            setDenominator(1);
        }
    }
}
