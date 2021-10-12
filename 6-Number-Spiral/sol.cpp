#include <bits/stdc++.h>
using namespace std;

#define deb(x) cout << #x << "=" << x << endl
#define ll long long
void solve()
{
	ll x,y,sol;
	cin >> y >> x;
	if(y > x){
		if(y&1){
			sol = (y-1)*(y-1) + x ;
		}else{
			sol = y*y - x + 1;;
		}
	}else{
		if(x&1){
			sol = (x)*(x) - y + 1;
		}else{
			sol = (x-1)*(x-1) + y;
		}
	}
	cout << sol <<endl;
}


int main()
{
	ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
	int t = 1;
	cin >> t;

	while (t--)
	{
		solve();
	}
	return 0;
}