package exercises.chapter2.ChristmasTree;

import java.util.Scanner;

public class PrintingChristmasGoodTree_V1 {

	public static void main(String[] args) {

		final Scanner scan = new Scanner(System.in);
		System.out.print("Enter tree height: ");
		final int numberOfRows = scan.nextInt();

		for (int actualRow = 0; actualRow <= numberOfRows; actualRow++) {

			int numberOfSigns = ((numberOfRows * 2) - 1);
			int numberOfX = ((actualRow * 2) - 1);
			int numberOfSpace = ((numberOfSigns - numberOfX) / 2);

			if (actualRow == 0) {
				for (int printSpaceForStar = numberOfSpace; (printSpaceForStar) >= 0; printSpaceForStar--) {
					if ((printSpaceForStar) == 0) {
						System.out.print("\\ /");
					}
					System.out.print(" ");
				}
			}

			if (actualRow == 1) {

				System.out.print("\n");

				for (int printSpaceForStar = numberOfSpace; (printSpaceForStar) >= 0; printSpaceForStar--) {
					if ((printSpaceForStar - 1) == 0) {
						System.out.print("-->*<--");
						System.out.print("\n");

						for (int printSpaceForFirstRow = numberOfSpace + 1; printSpaceForFirstRow >= 0; printSpaceForFirstRow--) {
							if (printSpaceForFirstRow == 0) {
								System.out.print("/_\\");
								printSpaceForFirstRow = 0;
							}
							System.out.print(" ");
						}
					}
					System.out.print(" ");
				}
			}

			if (actualRow % 2 == 0 && actualRow > 1) {

				for (byte loopOne = 2; loopOne > 0; loopOne--)

				{

					numberOfSpace = ((numberOfSigns - numberOfX) / 2);
					System.out.print("\n");

					for (int printX = numberOfX; printX > 0; printX--) {

						for (int printSpace = numberOfSpace; numberOfSpace >= 0; numberOfSpace--) {
							System.out.print(" ");

							if (numberOfSpace == 0) {
								System.out.print("/_");
							}

						}

						if (loopOne == 2) {
							if (printX % 2 == 0 && numberOfX != printX) {
								System.out.print("_");
							}

							if (printX % 2 != 0) {
								System.out.print("\\");
							}

						}

						else {
							if (printX % 2 == 0 && numberOfSpace != 0) {
								System.out.print("/");
							}

							if (printX % 2 != 0 && printX > 1
									&& printX != numberOfX) {
								System.out.print("_");
							}

							if (printX == 1) {
								System.out.print("_\\");
							}

						}

					}
				}
			}

			if (actualRow % 2 != 0 && actualRow > 1) {

				for (byte loopTwo = 2; loopTwo > 0; loopTwo--) {

					numberOfSpace = ((numberOfSigns - numberOfX) / 2);
					System.out.print("\n");

					for (int printX = numberOfX; printX > 0; printX--) {

						for (int printSpace = numberOfSpace; numberOfSpace >= 0; numberOfSpace--) {

							System.out.print(" ");

							if (numberOfSpace == 0) {
								System.out.print("/_");
							}

						}

						if (loopTwo == 2)

						{
							if (printX % 2 == 0) {
								System.out.print("\\");
							}

							if (printX % 2 != 0 && numberOfX != printX) {
								System.out.print("_");
							}

							if (printX == 1) {
								System.out.print("\\");
							}
						} else {
							if (printX % 2 == 0 && numberOfX != printX) {
								System.out.print("_");
							}

							if (printX % 2 != 0 && printX > 2) {
								System.out.print("/");
							}

							if (printX == 1) {
								System.out.print("\\");
							}
						}

					}
				}
			}

			for (int stammHöhe = numberOfRows / 2; (actualRow == numberOfRows)
					&& (stammHöhe > 0); stammHöhe--) {

				int stammDicke = (numberOfSigns / 4);

				System.out.print("\n");

				for (int printSpaceForStamm = ((numberOfSigns / 2) - (stammDicke / 2)) + 2; printSpaceForStamm >= 0; printSpaceForStamm--) {

					if (printSpaceForStamm == 0) {
						System.out.print("[");
					} else {
						System.out.print(" ");
					}
				}

				for (; stammDicke >= 1; stammDicke--) {

					if (stammDicke == 1) {
						System.out.print("]");
					} else {
						System.out.print("_");
					}
				}

			}

		}

	}

}
