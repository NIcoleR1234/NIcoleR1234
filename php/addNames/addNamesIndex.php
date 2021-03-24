<?php


$nameEntry=null;
if (!empty($_REQUEST['nameEntry'])) {
    $nameEntry = $_REQUEST['nameEntry'];
}

$myTextArea=null;
if (!empty($_REQUEST['myTextArea'])) {
    $myTextArea=$_REQUEST['myTextArea'];}
    
    
    $addClear = " ";
if (!empty($_REQUEST['addClear'])) {
    $addClear = $_REQUEST['addClear'];
}



if (isset($_POST))
{
   require_once 'addNamesProc.php';
   $addName=new AddNamesProc();
   $output= $addName->addClearNames($nameEntry, $myTextArea, $addClear);
}


//echo('$_POST = ');
//print_r($_POST);
//echo('<br><br>');
//echo('$_GET = ');
//print_r($_GET);
//echo('<br><br>');
//echo('$_REQUEST = ');
//// Notice how $_REQUEST contains both POST and GET values.
//print_r($_REQUEST);
//echo('<br><br>');

//
?>
<html>
    
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<hr size ="1" /> 
         <form action='index.php' method='post'>   
           <input type="submit" name="addClear" value="Add Names" class="btn btn-primary">&nbsp;
         <input type="submit" name="addClear" value="Clear Names" class="btn btn-primary">&nbsp;
         
    <br> Enter Name:&nbsp;&nbsp;<br>
   
        <input type="text" name="nameEntry"  size = 30 maxlength=50 > 
      
        <hr size ="1" /> 
        List of Names:&nbsp;&nbsp; <br>
   
         
       <textarea name="myTextArea" style="height: 500px;"  class="formcontrol"  rows="20" cols="50"><?php  echo  $output;?></textarea>    
         </form> 
         
    
</html>
