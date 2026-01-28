int maxProfit(int* prices, int pricesSize) {
    int minprice=INT_MAX;
    int profit=0;
    int maxprofit=INT_MIN;
    for(int itr=0;itr<pricesSize;itr++){
        if(minprice>prices[itr]) minprice=prices[itr];
        profit=prices[itr]-minprice;
        if(profit>maxprofit) maxprofit=profit;
    }
    printf("%d\n",maxprofit);
    return maxprofit;
}