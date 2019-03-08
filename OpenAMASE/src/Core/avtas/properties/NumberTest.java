// ===============================================================================
// Authors: AFRL/RQQD
// Organization: Air Force Research Laboratory, Aerospace Systems Directorate, Power and Control Division
// 
// Copyright (c) 2017 Government of the United State of America, as represented by
// the Secretary of the Air Force.  No copyright is claimed in the United States under
// Title 17, U.S. Code.  All Other Rights Reserved.
// ===============================================================================



package avtas.properties;

import avtas.util.WindowUtils;
import org.jdesktop.swingx.JXColorSelectionButton;

/**
 *
 * @author AFRL/RQQD
 */
public class NumberTest {
    
    public static void main(String[] args) {
        String str = String.valueOf(Long.MIN_VALUE);
        System.out.println(str);
        Number val = Double.parseDouble(str);
        System.out.println(val);

        Long l = val.longValue();
        System.out.println(l);
 
    }
    
}

/* Distribution A. Approved for public release. 
 *  Case: #88ABW-2015-4601. Date: 24 Sep 2015. */