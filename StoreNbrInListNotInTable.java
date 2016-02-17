import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * this one is used to select the store_nbr in the to-add list but has not been
 * added into `srm_stores_new` table
 * 
 * find out the elements in B but not A
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

	private static ArrayList<Integer> fineSame(int[] A, int[] B) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Set set = new HashSet<>();
		for (int i : A) {
			set.add(i);
		}

		for (int j : B) {
			if (!set.add(j)) {
				result.add(j);
			}
		}
		return result;
	}

	public static void main(String args[]) {
		// what we have in `srm_stores_new`
		// big list
		int[] B = { 6962, 7337, 7340, 3798, 1251, 4545, 6243, 3600, 3899, 7146, 6233, 6264, 5014, 4539, 3504, 3628,
				7304, 7162, 2525, 3121, 7062, 4190, 7222, 3080, 7209, 4551, 7206, 5765, 5017, 5016, 3638, 5378, 2500,
				6970, 2328, 4431, 6814, 5923, 5377, 7207, 3359, 7217, 7334, 5015, 7235, 5833, 7315, 4149, 5383, 4848,
				2870, 6997, 6981, 7218, 3037, 6174, 5302, 4157, 7098, 5013, 6176, 7180, 5291, 5024, 7102, 5395, 1250,
				3470, 2887, 3437, 3211, 5371, 4443, 4432, 6263, 2573, 3713, 3249, 5212, 3456, 5318, 3715, 3411, 4148,
				7137, 3257, 3646, 4452, 5367, 4147, 4537, 3007, 5084, 4541, 3256, 6828, 5393, 4145, 3338, 7296, 7205,
				3036, 7004, 3442, 6586, 7329, 5919, 2971, 4536, 4445, 5279, 3724, 4552, 5138, 2414 };

		// in the store list
		// small list
		int[] A = { 7334, 7004, 6962, 4148, 3411, 7162, 7207, 5138, 7205, 6828, 5024, 7340, 7337, 3713, 7217, 1250,
				6264, 5017, 7180, 4147, 3798, 3080, 7235, 3724, 4443, 5014, 7218, 4149, 6997, 3638, 3121, 7098, 5013,
				2414, 3899, 6814, 3600, 4452, 6176, 3646, 3628, 2887, 3338, 3211, 7222, 2500, 6243, 6174, 4445, 7062,
				3249, 6586, 7304, 7146, 4157, 7315, 2328, 3257, 2573, 7329, 4145, 3036, 3007, 7296, 3037, 7209, 5015,
				6263 };

		ArrayList<Integer> res = compare(A, B);
		System.out.println(res.toString());
		System.out.println("*******Result Size********");
		System.out.println(res.size());
		System.out.println("*******A Size********");
		System.out.println(A.length);
		System.out.println("*******B Size********");
		System.out.println(B.length);
		System.out.println("*******Same elements********");
		ArrayList<Integer> sameRes = fineSame(A, B);
		System.out.println(sameRes.toString());
		System.out.println("*******Number of Same elements********");
		System.out.println(sameRes.size());

	}
}
