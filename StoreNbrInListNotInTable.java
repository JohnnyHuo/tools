import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * this one is used to select the store_nbr in the to-add list but has not been
 * added into `srm_stores_new` table
 * 
 * select the elements in B but not A
 */
public class StoreNbrInListNotInTable {
	@SuppressWarnings("unchecked")
	private static ArrayList<Integer> compare(int[] A, int[] B) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Set set = new HashSet<>();
		for (int i : A) {
			set.add(i);
		}

		for (int j : B) {
			if (set.add(j)) {
				result.add(j);
			}
		}
		return result;
	}

	public static void main(String args[]) {

		int[] A = { 563, 1082, 4427, 1172, 3308, 4520, 1297, 2920, 4444, 551, 977, 3307, 3310, 1375, 488, 767, 1205,
				1090, 5037, 1225, 1081, 5054, 613, 1182, 5172, 579, 538, 3877, 1444, 3702, 1408, 1219, 860, 1077, 1173,
				1391, 1083, 2626, 1283, 3309, 1223 };

		int[] B = { 488, 538, 551, 563, 579, 613, 767, 860, 977, 1077, 1081, 1082, 1083, 1090, 1172, 1173, 1182, 1205,
				1219, 1223, 1225, 1283, 1297, 1375, 1391, 1408, 1444, 2626, 2920, 3307, 3308, 3309, 3310, 3702, 3877,
				4427, 4444, 4520, 5037, 5054, 5172, 555, 556, 588, 593, 605, 606, 635, 639, 686, 754, 758, 836, 843,
				858, 862, 864, 889, 899, 907, 952, 1006, 1011, 1018, 1024, 1061, 1072, 1076, 1143, 1153, 1227, 1293,
				1367, 1658, 2615, 2630, 2733, 2754, 2860, 2890, 3570, 3750, 4144, 4556, 5392, 5422, 5735, 5797, 7245,
				7246 };

		ArrayList<Integer> res = compare(A, B);
		System.out.println(res.toString());
	}
}
