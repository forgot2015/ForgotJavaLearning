package schema.creation.prototype.deep;

import java.io.Closeable;
import java.io.IOException;

/**
 * Author: zongfulin
 * Date: 2021/3/30
 * Time: 2:50 PM
 * Description:
 */
public class Address implements Cloneable {
    private String addr;

    public Address(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public Address clone() {
        Address address = null;
        try {
            address = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addr='" + addr + '\'' +
                '}';
    }
}
