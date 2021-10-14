#include <bits/stdc++.h>
using namespace std;

#define deb(x) cout << #x << "=" << x << endl
#define ll long long
void solve()
{
	ll n;
	cin >> n;
	cout << 0 << endl;
	
	for(ll i = 2;i<=n;i++){
		
		ll total = ((i*i)*(i*i - 1)/2)  ;
		total -= (2 + 2*(i-2))*(i-2);
		total -= (4 + 2*(i-4))*(i-1);
		cout << total<<endl; 
	}
	
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