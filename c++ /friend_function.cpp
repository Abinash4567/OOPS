#include <bits/stdc++.h>
using namespace std;

#define endl '\n';
typedef long long ll;
const ll INF = LLONG_MAX >> 1;


class AreaRectangle 
{
private:
    int length;
    int breadth;
    int perimeter;
    int area;
public:
    void setParameter(int a, int b)
    {
        length = a;
        breadth = b;
        area = length * breadth;
        perimeter = 2*(length + breadth);
    }
    friend void seeParameter(AreaRectangle);
};

void seeParameter(AreaRectangle e1)
{
    cout<<"Area is: "<<e1.area<<endl;
    cout<<"perimeter is: "<<e1.perimeter<<endl;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    #ifndef ONLINE_JUDGE
        clock_t tStart = clock();
    #endif


    AreaRectangle r1;
    r1.setParameter(6, 4);
    seeParameter(r1);


    #ifndef ONLINE_JUDGE
        fprintf(stderr, "\n>> Runtime: %.10fs\n", (double) (clock() - tStart) / CLOCKS_PER_SEC);
    #endif
    return 0;
}