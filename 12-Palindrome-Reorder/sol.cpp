#include <bits/stdc++.h>
using namespace std;

#define deb(x) cout << #x << "=" << x << endl
#define ll long long
void solve(){
	string s; 
	cin >> s;

	int cnt[26];
	memset(cnt , 0, sizeof(cnt));

	for( int i =0;i<s.length();i++){
		cnt[s[i] - 'A']++;
	}

	bool oddPresent = false;

	string start = "",mid,end = "";

	for(int i =0;i<26;i++){
		if(oddPresent && (cnt[i] &1)){
			cout << "NO SOLUTION\n";
			return;
		}
		if(cnt[i] & 1){
			oddPresent = true;
			mid = string(cnt[i] , 'A' + i);
		}else{
			start += string(cnt[i]/2,'A' + i);
		}
	}
	cout<< start + mid + string(start.rbegin(),start.rend());

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