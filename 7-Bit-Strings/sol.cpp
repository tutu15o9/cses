#include <bits/stdc++.h>
using namespace std;

#define deb(x) cout << #x << "=" << x << endl
#define ll long long

#define MOD 1000000007
ll fast_power(ll base, ll power) {
    ll result = 1;
    while(power > 0) {

        if(power & 1) {
            result = (result*base) % MOD;
        }
        base = (base * base) % MOD;
        power = power >> 1; 
    }
    return result;
}
void solve()
{
	ll n;
	cin>>n; 
	cout<<fast_power(2,n)<<endl;
}


int main()
{
	ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
	int t = 1;
	// cin >> t;

	while (t--)
	{
		solve();
	}
	return 0;
}