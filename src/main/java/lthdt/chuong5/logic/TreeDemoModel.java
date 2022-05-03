/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong5.logic;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Viet Khoa
 */
public class TreeDemoModel implements TreeModel {
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;

    public TreeDemoModel() {
        //Khởi tạo cây
        rootNode=buildTree("Car&Motor");
        tree=new DefaultTreeModel(rootNode);
    }
    private DefaultMutableTreeNode buildTree(String rootName){
        DefaultMutableTreeNode root=new DefaultMutableTreeNode(rootName);
        //Xây dựng các nút con cho nút root
        DefaultMutableTreeNode car=new DefaultMutableTreeNode("car");
        DefaultMutableTreeNode motor=new DefaultMutableTreeNode("Motor");
        //Đưa vào nút root
        root.add(car);
        root.add(motor);
        //Xây dựng nút con cho car
        DefaultMutableTreeNode honda=new DefaultMutableTreeNode("honda");
        DefaultMutableTreeNode maxda=new DefaultMutableTreeNode("maxda");
        DefaultMutableTreeNode toyota=new DefaultMutableTreeNode("toyota");
        car.add(honda);
        car.add(toyota);
        car.add(maxda);
        //Xây dựng các nút con cho motor
        DefaultMutableTreeNode suzuki=new DefaultMutableTreeNode("suzuki");
        DefaultMutableTreeNode yamaha=new DefaultMutableTreeNode("yamaha");
        motor.add(suzuki);
        motor.add(yamaha);
        //Trả về nút gốc của cây
        return root;
    }

    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(DefaultMutableTreeNode rootNode) {
        this.rootNode = rootNode;
    }
    

    @Override
    public Object getRoot() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.rootNode;
    }

    @Override
    public Object getChild(Object parent, int index) {
        return tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
       return tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
       return tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
       return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.removeTreeModelListener(l);
    }
    
}
