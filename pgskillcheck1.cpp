#include <string>
#include <vector>
#include <queue>
#include <math.h>
#include <iostream>
using namespace std;

// 입력받은 정수의 자릿수를 내림차순으로 정렬하여 다시 리턴하는 함수
long long solution(long long n);


int main(){

    cout << solution(123456) << endl;

    return 0;
}


long long solution(long long n) {
    long long answer = 0;
    priority_queue<int, vector<int>, greater<int> > a;
    int res;
    int other;
    int sub = 1;
    
    while(true){
        res = (int) n / 10;
        other = n % 10;

        printf("%d\n", other);
        a.push(other);
        n = res;
        
        if(res == 0) break;
    }
    int size = a.size();

    for (int i = 0; i < size; i++)
    {
        answer += a.top() * sub;
        a.pop();
        sub = sub * 10;
    }
    
    
    return answer;
}