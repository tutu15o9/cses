#include <bits/stdc++.h>
using namespace std;

#define deb(x) cout << #x << "=" << x << endl
#define ll long long
void solve()
{
	string dna;
	cin >> dna;
	ll sol = 1,i=1,curr = 1;
	while(i < dna.length()){
		if( dna[i-1] == dna[i]){
			curr++;
		}else{
			sol = max(curr,sol);
			curr = 1;
		}
		i++;
	}
	sol = max(curr,sol);

	cout<<sol<<endl;

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