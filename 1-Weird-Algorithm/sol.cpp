#include <bits/stdc++.h>
using namespace std;

#define deb(x) cout << #x << "=" << x << endl
#define ll long long 

void solve()
{
	ll n;
	cin >> n;

	while(n!=1){
		cout<<n<<" ";
		if(n&1){
			n = 3*n + 1;
		}else{
			n /= 2;
		}
	}
	cout<<1<<endl;
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