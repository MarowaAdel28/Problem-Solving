/*
 *	Binary Search Tree : Insertion
 *	https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem?isFullScreen=true
 *	basic-easy
*/

#include <bits/stdc++.h>

using namespace std;

class Node {
    public:
        int data;
        Node *left;
        Node *right;
        Node(int d) {
            data = d;
            left = NULL;
            right = NULL;
        }
};

class Solution {
    public:
  	
  	void preOrder(Node *root) {
		
      	if( root == NULL )
          	return;
      
      	std::cout << root->data << " ";
      	
      	preOrder(root->left);
      	preOrder(root->right);
    }

/*
Node is defined as 

class Node {
    public:
        int data;
        Node *left;
        Node *right;
        Node(int d) {
            data = d;
            left = NULL;
            right = NULL;
        }
};

*/

    Node * insert(Node * root, int data) {
        Node *newNode=new Node(data);
        Node *curent=root,*prev=root;
        if(root==NULL) 
        {
            root=newNode;
            return root;
        }
        while(1)
        {
            if(curent)
            {
                if(data>curent->data)
                {
                    curent=curent->right;
                    if(!curent)
                    {
                        prev->right=newNode;
                        return root;    
                    } 
                } 
                else
                {
                    curent=curent->left;
                    if(!curent) 
                    {
                        prev->left=newNode;
                        return root;
                    }
                } 
                prev=curent;
            }
            
        }
        preOrder(root);
        return root;
    }

};

int main() {
  
    Solution myTree;
    Node* root = NULL;
    
    int t;
    int data;

    std::cin >> t;

    while(t-- > 0) {
        std::cin >> data;
        root = myTree.insert(root, data);
    }
  	
    myTree.preOrder(root);
  
    return 0;
}
