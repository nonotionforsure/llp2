class CPF{
    private int cpf;
        CPF(int i){
        cpf=i;
        try{
            if(cpf < 0 || cpf > 999999999) {
         throw new Exception();
        }
    }
    catch (Exception e){
        System.out.println("O cpf é maior que 999999999 ou menor que 0");
    }
    }
    public int digitosVerificadores(){
    return digsVer(cpf);
    }
    private static int digsVer(int n){
    int[] d=new int[9];
    int aux=n;
    int i;
    for(i=0; i<9; i++){
    d[i]=aux%10;
    aux=aux/10;
    }
    int somaprod=0;
    for(i=0; i<9; i++)
    somaprod+=d[i]*(i+2);
    int dvDez=11-somaprod%11;
    if(dvDez>9)
    dvDez=0;
    somaprod=dvDez*2;
    for(i=0; i<9; i++)
    somaprod+=d[i]*(i+3);
    int dvUni=11-somaprod%11;
    if(dvUni>9)
    dvUni=0;
    return dvDez*10+dvUni;
    }
    }