#include <bits/stdc++.h>
using namespace std;

#define deb(x) cout << #x << "=" << x << endl
#define ll long long
void solve()
{
	ll size;
	cin >> size;
	ll sol = 0,curr,prev = -1;
	cin >> prev;
	for(int i=1;i<size;i++){
		cin >> curr;
		
		if(prev > curr){
			sol += prev - curr;
		}else{
			prev = curr;
		}
		
	}
	cout << sol;
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