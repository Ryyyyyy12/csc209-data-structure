public class BigNumber {
    private String number; //123

    public BigNumber(String number) {
        this.number = number;
    }
    public BigNumber(int number) {
        this.number = number+"";
    }
    public BigNumber add(BigNumber number2){ //555
        //"523" + "6789" = "7312"(BigNumber)
        //number1 + number2 = answer
        //operand1 + operand2
        String answer="";
        OurStack operand1 = new OurStack(number.length());
        OurStack operand2 = new OurStack(number2.toString().length()); //number2 = bignumber (not string) -> toString
        for(int i=0;i<number.length();i++){
            operand1.push(Integer.parseInt(number.substring(i,i+1)));

            //System.out.println("**"+operand1.topElement());
        }
        for(int i=0;i<number2.toString().length();i++){
            operand2.push(number2.number.charAt(i)-48);
        }

        /*
        int size;
        if(number.length()>number2.toString().length()){
            size = number.length()+1;
        }else {
            size = number2.toString().length()+1;
        }*/

        int size = Math.max(number.length(),number2.toString().length())+1; //or
        OurStack answerStack = new OurStack(size);

        int carry=0;
        while (!operand1.isEmpty() || !operand2.isEmpty()){
            int a = (operand1.isEmpty()?0:operand1.pop()) + (operand2.isEmpty()?0:operand2.pop()) + carry;
            answerStack.push(a%10); //if a = 17 => push7
            carry = a/10;                   //carry = 1
        }
        if(carry>0){
            answerStack.push(carry);
        }
        while (!answerStack.isEmpty()){
            answer += answerStack.pop();
        }
        return new BigNumber(answer);
    }
    public String toString(){
        return number;
    }
}
