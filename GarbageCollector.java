private class Blob {
int space[10000];
}

public class GCdemo {

public static void main(String[] args) {
// run this with increasing values of n.
int n = 10000;
Blob blobStore[] = new Blob[n];
for(int i=0;i<n;i++) {
Blob b = new Blob();
// what happens if you comment the following
blobStore[i] = b;
}
}
}
