
public class Test05 {

	public static void main(String[] args) {
		int[] sam = {
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 1, 1, 1, 0, 0, 0, 0,
				0, 1, 1, 1, 1, 1, 1, 0, 0, 0,
				0, 1, 1, 1, 1, 1, 1, 1, 1, 0,
				0, 1, 1, 1, 1, 1, 1, 1, 1, 0,
				0, 0, 1, 1, 1, 1, 1, 1, 0, 0,
				0, 0, 0, 1, 1, 1, 1, 0, 0, 0,
				0, 0, 0, 0, 1, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0
			};
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				int row = i*10;
				int sum = row+j;
				if(sam[sum]>=1) {
					if(sam[sum-10]>=1&&sam[sum-1]>=1&&sam[sum+1]>=1&&sam[sum+10]>=1) {
							sam[sum] = sam[sum]+1;
					}
				}
			}
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				int row = i*10;
				int sum = row+j;
				if(sam[sum]>=2&&sam[sum-10]>=2&&sam[sum-1]>=2&&sam[sum+1]>=2&&sam[sum+10]>=2) {
					sam[sum] = sam[sum]+1;
				}
			}
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				int row = i*10;
				int sum = row+j;
				if(sam[sum]>=3&&sam[sum-10]>=3&&sam[sum-1]>=3&&sam[sum+1]>=3&&sam[sum+10]>=3) {
					sam[sum] = sam[sum]+1;
					System.out.print(sam[sum]);
				}else {
					System.out.print(sam[sum]);
				}
			}
			System.out.println();
		}
	}
}
