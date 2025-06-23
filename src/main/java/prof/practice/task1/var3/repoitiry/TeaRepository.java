package prof.practice.task1.var3.repoitiry;

import prof.practice.task1.var1.Tea;

public class TeaRepository {
    private Tea[] teas;
    private int counterTea = 0;

    public TeaRepository(int capacity) {
        this.teas = new Tea[capacity];
    }

    public boolean addTea(Tea teaName) {
        if (counterTea < teas.length) {
            teas[counterTea++] = teaName;
            return true;
        }
        return false;
    }

    public Tea findTeaById(int id) {
        for (int i = 0; i < counterTea; i++) {
            if (teas[i].getId() == id) {
                return teas[i];
            }
        }
        return null;
    }

    public Tea findByManufactAndType(String manuf, String type) {
        for (int i = 0; i < counterTea; i++) {
            if (teas[i].getManufacturer().equals(manuf) &&
                    teas[i].getType().equals(type)) {
                return teas[i];
            }
        }
        return null;
    }

    public Tea[] getAll() {
        Tea[] result = new Tea[counterTea];
        int index = 0;
        for (int i = 0; i < counterTea; i++) {
            if (teas[i] != null) {
                result[index++] = teas[i];
            }
        }
        return result;
    }
}

