#include <bits/stdc++.h>
using namespace std;

#define deb(x) cout << #x << "=" << x << endl
#define ll long long
void solve()
{
	int a,b;
	cin >> a >> b;

	if(a > 2*b || b > 2*a || (a +b )%3 != 0 ){
		cout<<"NO\n";
	}else{
		cout<< "YES\n";
	}
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