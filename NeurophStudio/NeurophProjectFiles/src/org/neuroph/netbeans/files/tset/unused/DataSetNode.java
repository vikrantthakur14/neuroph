package org.neuroph.netbeans.files.tset.unused;

import org.neuroph.netbeans.files.tset.*;
import org.openide.loaders.DataNode;
import org.openide.nodes.Children;
import org.openide.util.Lookup;

/**
 *
 * @author zoran
 */
public class DataSetNode extends DataNode {

    public DataSetNode(DataSetDataObject obj, Children ch, Lookup lookup) {
        super(obj, ch, lookup);
        this.setDisplayName(obj.getName());
        this.setShortDescription("Data Set File");
    }
/*
    @Override
    public PasteType getDropType(Transferable t, final int action, int index) {
        final Node dropNode = NodeTransfer.node(t,
                DnDConstants.ACTION_COPY_OR_MOVE + NodeTransfer.CLIPBOARD_CUT);
        if (null != dropNode) {
            final DataSet dataSet = (DataSet) dropNode.getLookup().lookup(DataSet.class);
            if (null != dataSet && !this.equals(dropNode.getParentNode())) {
                final DataSetNode node = this;
                return new PasteType() {
                    public Transferable paste() throws IOException {
                        getChildren().add(new Node[]{node});
                        if ((action & DnDConstants.ACTION_MOVE) != 0) {
                            dropNode.getParentNode().getChildren().remove(new Node[]{dropNode});
                        }
                        return null;
                    }
                };
            }
        }
        return null;
    }

    @Override
    protected void createPasteTypes(Transferable t, List s) {
        super.createPasteTypes(t, s);
        PasteType paste = getDropType(t, DnDConstants.ACTION_COPY, -1);
        if (null != paste) {
            s.add(paste);
        }
    }
    
    public Transferable drag() throws IOException {
        ExTransferable retValue = ExTransferable.create( super.drag() );
        //add the 'data' into the Transferable
        final DataSet dataSet= getLookup().lookup(DataSet.class);
        retValue.put( new ExTransferable.Single( new DataFlavor(DataSet.class, "DataSet") ) {
            protected Object getData() throws IOException, UnsupportedFlavorException {
                return dataSet;
            }
        });
        return retValue;
    }    
    */
}
