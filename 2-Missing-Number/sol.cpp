#include <bits/stdc++.h>
using namespace std;

#define deb(x) cout << #x << "=" << x << endl
#define ll long long 
void solve()
{
	ll size;
	cin >> size;
	ll sol = 0;
	for(int i =0;i<size-1;i++){
		ll t;
		cin >> t;
		sol ^= ((ll)(i+1))^t;
	}
	cout << (sol ^ size);

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