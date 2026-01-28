/*char* intToRoman(int num) {
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
}*/
char* intToRoman(int num) {
    typedef struct{
        int number;
        char roman[3];
    } Roman;
    Roman pair[13]={
          {1000, "M"}, {900,  "CM"}, {500,  "D"}, {400,  "CD"}, {100,  "C"}, {90,   "XC"},  {50,   "L"},  {40,   "XL"},  {10,   "X"},  {9,    "IX"},    {5,    "V"},   {4,    "IV"},  {1,    "I"}
    };
    static char res[32];
    res[0]='\0';
    for(int itr=0;itr<13;itr++){
        while(num>=pair[itr].number){
            num-=pair[itr].number;
            strcat(res,pair[itr].roman);
        }
    }
    return res;

}