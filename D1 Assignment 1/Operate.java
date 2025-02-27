class Operate
{
public static void main(String args[])
	{
	int a = -5;
	int b = 8;
	int c = 6;
	int d = a + b * c;
	System.out.println(d +"\n");

	int e = 55;
	int f = 9;
	int g = (e + f) % f;
	System.out.println(g + "\n");

	int h = 20;
	int i = -3;
	int j = -a;
	int k = 8;
	int l = h + i * j / k;
	System.out.println(l + "\n");

	int m = 15;
	int n = -i;
	int o = 2;
	int p = -a + m / -i * o - k % -i;
	System.out.println(p);
	}
}