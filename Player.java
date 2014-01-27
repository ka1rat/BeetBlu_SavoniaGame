class Player {
	String name;
	int hrate;
	int xp;
	int lvl;
	int endurance;
	int strength;
	int nxt_lvl_xp[] = {100,200,300,400,500,600,700,800,900,1000};
	void IncreaseXP(int value) {
		xp += value;
	}
	void IncreaseLVL() { 
		if (lvl<10 ) {
		double tmp_xp = xp/100;
		tmp_xp = ceil(tmp_xp);
			switch (tmp_xp) {
				case 1:  lvl = 1;
						 break;
				case 2:  lvl = 2;
						 break;
				case 3:  lvl = 3;
						 break;
				case 4:  lvl = 4;
						 break;
				case 5:  lvl = 5;
						 break;
				case 6:  lvl = 6;
						 break;
				case 7:  lvl = 7;
						 break;
				case 8:  lvl = 8;
						 break;
				case 9:  lvl = 9;
						 break;
				case 10: lvl = 10;
						 break;
			}
		}
	}
	void IncreaseStrength(int value) {
		strength += value;
	}
	void IncreaseEndurance(int value) {
		endurance += value;
	}
	void GetHeartRate() {
	}
};
