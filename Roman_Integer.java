int result=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(i!=s.length()-1 && Symbol(a)<Symbol(s.charAt(i+1))){
                result=result-Symbol(a);
            }
            else{
                result=result+Symbol(a);
            }
        }
        System.out.print(result+" ");

    }
    public static int Symbol(char a){
        return switch (a) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };

    }

    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        String s=S.nextLine();
        Roman_Integer RI=new Roman_Integer();
        RI.RomanInt(s);
    }
}
