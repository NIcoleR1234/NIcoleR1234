<?php

class AddNamesProc{
     
 public function change($entry)
 { 
  $name1=explode(" ", $entry);
  if (!empty($entry)){
    $singleStr= $name1[1]. ", ". $name1[0];}
   else
   {    $singleStr="";}
 return $singleStr;
}

public function addClearNames($entry, $formerStr,$aC){
 
   if($aC=="Add Names")
   {    $str1=$this->change($entry);
        $names=explode("\n", $formerStr);
        $names[]= $str1;
        sort($names);
        $completeStr = implode("\n",$names);}
    else
    {
        empty($names);
       $completeStr = implode("\n",$names);
    }
return $completeStr;
    
    
     
}//for function
}//for class



