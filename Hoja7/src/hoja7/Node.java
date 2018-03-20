/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja7;

/**
 *
 * @author cooli
 */
public class Node {
    /* Class containing left and right child of current node and key value*/
    
        Association key;
        Node left, right;
 
        public Node(Association item) {
            key = item;
            left = right = null;
        }
    
    
}
