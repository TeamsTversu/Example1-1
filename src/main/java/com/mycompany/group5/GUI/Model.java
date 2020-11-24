
package com.mycompany.group5.GUI;

import javax.swing.AbstractListModel;
import com.mycompany.group5.List;

public class Model extends AbstractListModel<Integer> {

    private static final long serialVersionUID = 1L;
    List list;

    public Model(List list) {
        this.list = list;
    }

    public Model() {}

    public void setList(List list) {
        this.list = list;
    }
    

    @Override
    public int getSize() {
        return getList().getSize();
    }

    @Override
    public Integer getElementAt(int index) {
        synchronized(getList()) {
        Integer i = (Integer) getList().getIndex(index);
        return i;
        }
    }

    @SuppressWarnings("unchecked")
    void addElement(int k) {
        getList().add(k);
        fireIntervalAdded(this, 0, getList().getSize());
    }

    public List getList() {
        return list;
    }
    
}
