# RecyclerViewAndroid
Linear and Grid RecyclerView , Json Example using Volley Library

In This Example We show the RecyclerView Example

1. Linear RecyclerView

For Linear Recycler View You have to set the LayoutManager as LinearLayoutManager for RecyclerView

                  LinearLayoutManager manager = new LinearLayoutManager(this);
                  recyclerView.setLayoutManager(manager);


2. Grid RecyclerView

For Grid RecyclerView You have to set the LayoutManager as GridLayoutManager for RecyclerView

                  GridLayoutManager manager = new GridLayoutManager(this, 3); // context , spanCount are two arguments
                  recyclerView.setLayoutManager(manager);
                  
3. Recycler View with dynamic data featching from the Internet using Volley Library.

For this We use http://myjson.com Website to Create My own Json file and featch it using Volley and  Displyed in RecyclerView
