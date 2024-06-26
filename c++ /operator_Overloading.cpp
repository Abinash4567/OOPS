#include <bits/stdc++.h>
using namespace std;

#define endl '\n';
typedef long long ll;
const ll INF = LLONG_MAX >> 1;

struct myVal {
    int count;
    string name;

    myVal(int cc, string nn)
    {
        count = cc;
        name = nn;
    }
};

struct listMyVal {
    list<myVal> listing;

    void operator+=(myVal &value)
    {
        listing.push_back(value);
    }
};

ostream& operator<<(ostream &COUT, myVal &t1)
{
    COUT<<"Name: "<<t1.name<<endl;
    COUT<<"Count: "<<t1.count<<endl;
    return COUT;
}

ostream& operator<<(ostream &COUT, listMyVal &value)
{
    for(myVal i:value.listing)
        COUT<<i<<endl;
    return COUT;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    #ifndef ONLINE_JUDGE
        clock_t tStart = clock();
    #endif


    myVal t1 = myVal(12, "Abinash");
    myVal t2 = myVal(20, "Abc");
    cout<<t1<<t2;

    listMyVal first1;
    first1+=t1;
    first1+=t2;
    cout<<first1;



    #ifndef ONLINE_JUDGE
        fprintf(stderr, "\n>> Runtime: %.10fs\n", (double) (clock() - tStart) / CLOCKS_PER_SEC);
    #endif
    return 0;
}