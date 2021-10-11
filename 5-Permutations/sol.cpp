#include <bits/stdc++.h>
using namespace std;

#define deb(x) cout << #x << "=" << x << endl
#define ll long long
void solve()
{
	long n;
	cin >> n;
	if(n==1){
		cout << 1 << endl;
		return;
	}
	if(n == 4){
		cout << "2 4 1 3" << endl;
		return;
	}
	if(n == 2 || n == 3  ){
		cout << "NO SOLUTION" << endl;
		return;
	}

	string s1 = "" ,s2 = "";

	while(n>0){
		s1 += to_string(n) + " ";
		if(n>1)
			s2 += to_string(n - 1) + " ";
		n -= 2;
	}

	cout<< s1 << s2 << endl;


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