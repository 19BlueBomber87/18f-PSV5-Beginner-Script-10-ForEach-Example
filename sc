$BB="MarkK.";$SD="2018-11-15";$PSV5="PowerShellVersion5";$XamplePurpose="Learn, Share and Document";$DJ="Save The Puppies! <3<3<3";$SP="<@:)";$TY="ThankYou For Your Help :)";$MK="UAA Alum, CMC Alum, CNT Student, PowerShell Enthusiast";$TFTSP_FWH="Founder of: The Foundation to Save The Puppies From Write-Host";$Mission="Spread Joy Through Learning PS5";$TFW="ThanksForWatching"
$MyFirstHashTableIsMyDigitalSignature=[Ordered]@{Name="Name: $BB";MarkK="MarkK.:$MK";Date="StarDate: $SD";PSVersion="PowerShellVersionUsed: $PSV5";
Xample="Prupose: $XamplePurpose";Thanks="$TY";TFTSP_FWH="$TFTSP_FWH";Mission="$mission";DJ="$DJ";TFW="$TFW";SP="$SP"}
Cls
Function Blue-Bomber
{
ForEach ($BlueBombersInfo in $MyFirstHashTableIsMyDigitalSignature)
{
    Write-Verbose -Message ($BlueBombersInfo).Name      -Verbose 6>&1
    Write-Verbose -Message ($BlueBombersInfo).MarkK     -Verbose 5>&1
    Write-Verbose -Message ($BlueBombersInfo).Date      -Verbose 4>&1
    Write-Verbose -Message ($BlueBombersInfo).PSVersion -Verbose 3>&1
    Write-Verbose -Message ($BlueBombersInfo).Xample    -Verbose 2>&1
    Write-Verbose -Message ($BlueBombersInfo).Thanks    -Verbose *>&1
    Write-Verbose -Message ($BlueBombersInfo).TFTSP_FWH -Verbose 2>&1
    Write-Verbose -Message ($BlueBombersInfo).Mission   -Verbose 3>&1
    Write-Verbose -Message ($BlueBombersInfo).DJ        -Verbose 4>&1
    Write-Verbose -Message ($BlueBombersInfo).TFW       -Verbose 5>&1
    Write-Verbose -Message ($BlueBombersInfo).SP        -Verbose 6>&1
}
}
cls
Blue-Bomber

#############################################################VerboseTable
$X_1=Write-Verbose -Message "Most people understand simple examples like this one
We Start Small and work our way up" -Verbose *>&1
$X_2=Write-Verbose -Message "This Example is the exact same as the previous examples except
I added more Objects and used more of the ‘ForEach’ Object I.  Observe the time stamps changing
" -Verbose *>&1
$X_3=Write-Verbose -Message "This Example is Identical to Example[3] however at the end of the ForEach statement,
I use read-host to pause the ForEach Loop
CLS is there to keep everything clean and makes a need transition by
getting rid of the previous objects properties creates a neat screen effect by only
displaying one object at at time" -Verbose *>&1
$X_4= {Write-Verbose -Message "Replacing Read-Host with start-sleep, I now have automated the process
To run in time interval I choose.  For this Example I am using 3 seconds" -Verbose *>&1}
$X_5=Write-Verbose -Message "Now we move on to trying this with WMI information
in this example The ForEach main object(UAA) was set to 'Get-EventLog -LogName Application  -Newest 12' " -Verbose *>&11
##############################################################
##learning ForEach
#Get-EventLog -LogName Application -InstanceId 10021, 916 -Newest 1 | format-list *
cls
Read-Host "Press any key to start"
$A=1;$B=2;$C=3;
$ABC = $A,$B,$C
cls
ForEach ($D in $ABC)
{
Write-Verbose -Message "$D Happiness_For_Mega_Man" -Verbose *>&1
}
Clear-Variable A, B, C
$X_1
Read-Host "Press any key to start example [1]"
#############################################################Example_[1]#####################################################################################################
$A=1;$B=2;$C=3;
$ABC = $A,$B,$C
cls
ForEach ($D in $ABC)
{
$BB=(Get-Date).Hour
$BB_1=(Get-Date).Minute
$BB_2=(Get-Date).Second
$BB_3=(Get-Date).Millisecond
Write-Verbose -Message "$D Happiness_For_Mega_Man
--------------------------------------------------------------------------------[$BB]Hours
--------------------------------------------------------------------------------[$BB_1]Minutes
--------------------------------------------------------------------------------[$BB_2]Seconds
--------------------------------------------------------------------------------($BB_3].Millisecond" -Verbose *>&1
}
Write-Verbose -Message "This Example is the same as the first except for now I have
included Time Stamps by using the Date-Time commands" -Verbose *>&1
ReaD-Host "Press any key to start example[2]"
#############################################################Example_[2]###################################################################################BreaksAreSweet#####################
Clear-Variable A, B, C
Clear-Host
$a=0
$b=1
$C=2
$D=3
$E=4
$F=5
$G=6
$H=7
$A_B_C = $A, $B, $C, $D, $E, $F, $H
$H=7
ForEach ($I in $A_B_C)
{
$BB=(Get-Date).Hour
$BB_1=(Get-Date).Minute
$BB_2=(Get-Date).Second
$BB_3=(Get-Date).Millisecond
Write-Verbose -Message "-----------------------------------------This Is Example $I---------------------------------" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "This_Is_Example_[$F]" -Verbose *>&1
Write-Verbose -Message "$A, $B, $C" -Verbose *>&1
Write-Verbose -Message "$A" -Verbose *>&1
Write-Verbose -Message "$B" -Verbose *>&1
Write-Verbose -Message "$C" -Verbose *>&1
Write-Verbose -Message "
$A,$B,$C
$B
$C
" -Verbose *>&1
Write-Verbose "_End_Of_Example [$I]
-------------------------------------[$I]--Example END----------------------------------------------------------------------breaksAresweet----------------
--------------------------------------------------------------------------------[$BB]Hours
--------------------------------------------------------------------------------[$BB_1]Minutes
--------------------------------------------------------------------------------[$BB_2]Seconds
--------------------------------------------------------------------------------($BB_3].Millisecond
" -Verbose *>&1
}
$X_2
ReaD-Host "Press any key to start example[3]"
#############################################################Example [3]###################################################################################BreaksAreSweet#####################
Clear-Variable A, B, C, D, E, F, G, H
Clear-Host
$a=0
$b=1
$C=2
$D=3
$E=4
$F=5
$G=6
$H=7
$A_B_C = $A, $B, $C, $D, $E, $F, $G, $H
ForEach ($I in $A_B_C)
{$BB=(Get-Date).Hour
$BB_1=(Get-Date).Minute
$BB_2=(Get-Date).Second
$BB_3=(Get-Date).Millisecond
Write-Verbose -Message "-----------------------------------------This Is Example $I---------------------------------" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "$A" -Verbose *>&1
Write-Verbose -Message "$A, $B, $C" -Verbose *>&1
Write-Verbose -Message "$B" -Verbose *>&1
Write-Verbose -Message "$C" -Verbose *>&1
Write-Verbose -Message "
$A,$B,$C
$B
$C
" -Verbose *>&1
Write-Verbose "_End_Of_Example [$I]
-------------------------------------[$I]--Example END----------------------------------------------------------------------breaksAresweet----------------
--------------------------------------------------------------------------------[$BB]Hours
--------------------------------------------------------------------------------[$BB_1]Minutes
--------------------------------------------------------------------------------[$BB_2]Seconds
--------------------------------------------------------------------------------($BB_3].Millisecond
" -Verbose *>&1
Read-Host "To_See_The_Next_Data _Set Press_Any_Key"
cls
}
$X_3
ReaD-Host "Press any key to start example[4]"
#############################################################Example [4]###################################################################################BreaksAreSweet#####################
Clear-Variable A, B, C
Clear-Host
$a=0
$b=1
$C=2
$D=3
$E=4
$F=5
$G=6
$H=7
$A_B_C = $A, $B, $C, $D, $E, $F, $G, $H

ForEach ($I in $A_B_C)
{
$BB=(Get-Date).Hour
$BB_1=(Get-Date).Minute
$BB_2=(Get-Date).Second
$BB_3=(Get-Date).Millisecond
Write-Verbose -Message "-----------------------------------------This Is Example $I---------------------------------" -Verbose *>&1
Write-Verbose -Message "This_Is_Example_[$F]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]-[$I]" -Verbose *>&1
Write-Verbose -Message "$A, $B, $C" -Verbose *>&1
Write-Verbose -Message "$A, $B, $C" -Verbose *>&1
Write-Verbose -Message "$A" -Verbose *>&1
Write-Verbose -Message "$B" -Verbose *>&1
Write-Verbose -Message "$C" -Verbose *>&1
Write-Verbose -Message "
$A,$B,$C
$B
$C
" -Verbose *>&1
Write-Verbose "_End_Of_Example [$I]
-------------------------------------[$I]--Example END----------------------------------------------------------------------breaksAresweet----------------
--------------------------------------------------------------------------------[$BB]Hours
--------------------------------------------------------------------------------[$BB_1]Minutes
--------------------------------------------------------------------------------[$BB_2]Seconds
--------------------------------------------------------------------------------($BB_3].Millisecond
" -Verbose *>&1
Write-Verbose "_End_Of_Example [$I]
--------------------------------------------------------------------------------------------------------[$I]--Example END------------------------------------------------------------------
" -Verbose *>&1
#Read-Host "END"
Start-Sleep 3
cls
}
$X_3
#############################################################Example [5]###################################################################################BreaksAreSweet#####################
Clear-Variable A, B, C, D, E, F, G, H
Cls
$UAA = Get-EventLog -LogName Application  -Newest 12
cls
ForEach ($M_W_K in $UAA)
{
$BB=(Get-Date).Hour
$BB_1=(Get-Date).Minute
$BB_2=(Get-Date).Second
$BB_3=(Get-Date).Millisecond
($M_W_K).timeGenerated | Format-List * | Out-File C:\Kruse\Verbose\18f-ForEach.txt
$M_W= Get-Content -Raw C:\Kruse\Verbose\18f-ForEach.txt
cls
Write-Verbose "$M_W" -Verbose *>&1
Sleep 2

}

$X_4
Read-Host "Thanks For Helping Me Progress At Powershell <@:)"
cls
Blue-Bomber





