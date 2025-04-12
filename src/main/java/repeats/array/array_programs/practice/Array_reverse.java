package repeats.array.array_programs.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] rev = new int[arr.length];
        int n = arr.length;
        int p=n;
        for (int i = 0; i < n; i++) {
            rev[p - 1] = arr[i];
            p = p - 1;
        }
        System.out.println(Arrays.toString(rev));
    }


    /*
    Sprint automation
    Explain agile process
    num of elements in a page
    explain loading and stop loading commands
    if num of elements are changinf hwo to handle
    link in website, new tabs open, one tab contains terms & conditons, how will you find that tab, write a code in slee
    explain latest version in selenium
    method overload & override, in project
    what is abstract & interace
    list vs map
    git process
    request spec in rest asuured
    what is form.xml

    API testing
    state course in api testing
    most recent expeice in automation
    rest assured command to cerate payload
    basic cookies used in api projects
    write a page code of map implementation
    explain testng concepts used in your porject
    how to store responses, what are the classes used
    write  a code for json,
    waht is .m2 folder in maven
    write a code for get requwst
    explain query param & path params
    code for select class in selenium
    xpath in selenium
    pojo class rest assureds
    status cides handling now
    % of work done in UI and API
    methods handled in api automation
    post vs put, scenario
    application curently working on




     */

}
