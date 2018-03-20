/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cooli
 */
public class BinarySearchTreeTest {
    
    public BinarySearchTreeTest() {
    }

    /**
     * Test of insert method, of class BinarySearchTree.
     */
    @Test
    public void testInsert() {
    }

    /**
     * Test of insertRec method, of class BinarySearchTree.
     */
    @Test
    public void testInsertRec() {
    }

    /**
     * Test of inorder method, of class BinarySearchTree.
     */
    @Test
    public void testInorder() {
    }

    /**
     * Test of inorderRec method, of class BinarySearchTree.
     */
    @Test
    public void testInorderRec() {
    }

    /**
     * Test of search method, of class BinarySearchTree.
     */
    @Test
    public void testSearch() {
        Association word = new Association("hello","hola");
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(word);
        Node nodo = new Node(word);
        assertEquals(bst.search(nodo,"hello").key.getValue(),"hola");
    }
    
}
