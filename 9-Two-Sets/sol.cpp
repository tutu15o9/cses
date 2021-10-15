#include <bits/stdc++.h>
using namespace std;

#define deb(x) cout << #x << "=" << x << endl
#define ll long long
void solve()
{
	ll n;
	cin >> n;

	if( n%4 == 0 || (n+1) % 4 == 0){
		cout << "YES\n";
		if (n&1){
			ll t1[n/2 + 1],t2[n/2],t1i = 1,t2i = 0,i;
			t1[0] = 1;

			bool sw = false;
			for(i = 2;i<= n/2;i++){
				if(sw){
					t1[t1i] = i;
					t1[t1i + 1] = n - i + 2;
					t1i += 2;
				}else{
					t2[t2i] = i;
					t2[t2i + 1] = n - i + 2;
					t2i += 2;
				}
				sw = !sw;
			}
			t1[n/2] = i;
			t2[n/2 - 1] = i+1;
			cout << n/2 + 1<<endl;
			for( i = 0;i< n/2 +1;i++){
				cout<< t1[i] << " ";
			}
			cout << endl << n/2 <<endl;
			for( i = 0;i< n/2 ;i++){
				cout<< t2[i] << " ";
			}
			cout<<endl;
		}else{
			ll t1[n/2],t2[n/2],t1i = 0,t2i = 0 ,i;
			bool sw = false;
			for(i = 1;i<= n/2;i++){
				if(sw){
					t1[t1i] = i;
					t1[t1i + 1] = n - i + 1;
					t1i += 2;
				}else{
					t2[t2i] = i;
					t2[t2i + 1] = n - i + 1;
					t2i += 2;
				}
				sw = !sw;
			}
			cout << n/2 <<endl;
			for( i = 0;i< n/2;i++){
				cout<< t1[i] << " ";
			}
			cout << endl << n/2 <<endl;
			for( i = 0;i< n/2 ;i++){
				cout<< t2[i] << " ";
			}
			cout<<endl;
		}
	}else{
		cout << "NO\n";
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