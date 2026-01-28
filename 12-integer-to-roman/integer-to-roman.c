char* intToRoman(int num) {
char roman[13][3] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    int number[13]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    char *res;
    res=malloc(50);
    res[0]='\0';
    for(int itr=0;itr<13;itr++){
        while(num>=number[itr]){
            num-=number[itr];
            //res[i]=roman[i];
            strcat(res,roman[itr]);
        }
    }
    return res;   
}