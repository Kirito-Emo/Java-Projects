package it.unisa.diem.oop.provided;

import it.unisa.diem.oop.developed.group75.Device;
import it.unisa.diem.oop.developed.group75.DeviceStore;
import java.util.Comparator;
import java.util.Set;

public interface Filterable {
   public DeviceStore filter(DeviceFilter d, Comparator<Device> c);
}
