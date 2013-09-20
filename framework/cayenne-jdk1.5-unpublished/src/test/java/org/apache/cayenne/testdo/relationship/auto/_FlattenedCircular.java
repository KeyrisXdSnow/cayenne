package org.apache.cayenne.testdo.relationship.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.testdo.relationship.FlattenedCircular;

/**
 * Class _FlattenedCircular was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FlattenedCircular extends CayenneDataObject {

    public static final String SIDE2S_PROPERTY = "side2s";
    public static final String SIDE1S_PROPERTY = "side1s";

    public static final String ID_PK_COLUMN = "ID";

    public void addToSide2s(FlattenedCircular obj) {
        addToManyTarget("side2s", obj, true);
    }
    public void removeFromSide2s(FlattenedCircular obj) {
        removeToManyTarget("side2s", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<FlattenedCircular> getSide2s() {
        return (List<FlattenedCircular>)readProperty("side2s");
    }


    public void addToSide1s(FlattenedCircular obj) {
        addToManyTarget("side1s", obj, true);
    }
    public void removeFromSide1s(FlattenedCircular obj) {
        removeToManyTarget("side1s", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<FlattenedCircular> getSide1s() {
        return (List<FlattenedCircular>)readProperty("side1s");
    }


}