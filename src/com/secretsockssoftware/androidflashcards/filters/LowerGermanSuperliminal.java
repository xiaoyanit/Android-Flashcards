/*
* Copyright 2010 Nick Lanham
*
* This file is part of "AndroidFlashcards".
*
* "AndroidFlashcards" is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* "AndroidFlashcards" is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with "AndroidFlashcards". If not, see <http://www.gnu.org/licenses/>.
*/

package com.secretsockssoftware.androidflashcards.filters;

public class LowerGermanSuperliminal extends CSVColFilter {

	private static int[] outOrder = {1,0};

	public LowerGermanSuperliminal() 
		throws Exception {
		super(9,new RowTester() {
				public boolean keepRow(String[] row) {
					return (Integer.parseInt(row[2]) < 5);
				}
			},
			outOrder);
	}

	public String filterLine(String in,int lineNum) {
		if (lineNum == 1) 
			return "\"Lower German Words\",\"Words of importance 2 3 and 4 from Melinda Green's list of German vocabulary.  See: www.superliminal.com\"\n";
		else
			return 
				super.filterLine(in,lineNum);
	}
}

