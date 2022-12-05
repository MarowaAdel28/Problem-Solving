/*
 *  Queue using Two Stacks
 *  meduim
 *  https://www.hackerrank.com/challenges/queue-using-two-stacks/problem?isFullScreen=true
*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int q,i=0;
    vector<long>vect;
    cin >>q;
    while(q--)
    {
        int t;
        cin>>t;
        if(t==1)
        {
            long n;
            cin>>n;
            vect.push_back(n);
        }
        else if(t==2) i++;
        else cout<<vect[i]<<endl;
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
