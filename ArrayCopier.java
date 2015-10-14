/*
* Week 3 Day 6
* 2. Copying Arrays
*/

public class ArrayCopier{

	public static void copy(int[] src, int[] dst){
		int srcSize = src.length;
		int dstSize = dst.length;
		if ((srcSize == dstSize) || (srcSize > dstSize)){
			for (int i = 0; i < dstSize; i++){
				dst[i] = src[i];
			}
		}else{
			for (int i = 0; i < dstSize; i++){
				for(; i < srcSize; i++){
					dst[i] = src[i];
				}
				dst[i] = 0;
			}
		}
	}
}