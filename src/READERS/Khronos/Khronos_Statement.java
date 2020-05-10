package READERS.Khronos;

import READERS.Generic_Process_DOC;

import java.nio.file.Path;
import java.util.ArrayList;

public class Khronos_Statement extends Generic_Process_DOC {

    private Double LP_Commitment, Unfunded_LP_Commitment, LP_ownership_percentage_of_total_commitment;
    private Double BeginningBalance_Quarter, BeginningBalance_SI;
    private Double CapitalCall_Quarter, CapitalCall_SI;
    private Double Distributions_Quarter, Distributions_SI;
    private Double Transfers_Quarter, Transfers_SI;
    private Double NetIncome_Quarter, NetIncome_SI;
    private Double EndingBalance_Quarter, EndingBalance_SI;


    public Khronos_Statement(Path path) {
        super();
        generalProcess(path);

    }

    @Override
    public void value_Assigner(ArrayList<Double> numbersArray) {

        LP_Commitment = numbersArray.get(6);
        Unfunded_LP_Commitment = numbersArray.get(7);
        LP_ownership_percentage_of_total_commitment = numbersArray.get(9);

        BeginningBalance_Quarter = numbersArray.get(11);
        BeginningBalance_SI = numbersArray.get(15);

        CapitalCall_Quarter = numbersArray.get(16);
        CapitalCall_SI = numbersArray.get(18);

        Distributions_Quarter = numbersArray.get(19);
        Distributions_SI = numbersArray.get(21);

        Transfers_Quarter = numbersArray.get(22);
        Transfers_SI = numbersArray.get(24);

        NetIncome_Quarter = numbersArray.get(25);
        NetIncome_SI = numbersArray.get(27);

        EndingBalance_Quarter = numbersArray.get(29);
        EndingBalance_SI = numbersArray.get(33);

    }

    @Override
    public void print_all_info(ArrayList<Double> numbersArray) {
        super.print_all_info(numbersArray);

        System.out.println("\n");

        System.out.println("LP Commitment: " + LP_Commitment);
        System.out.println("Unfunded LP Commitment: " + Unfunded_LP_Commitment);
        System.out.println("LP Ownership Percentage of Total Commitment: " + LP_ownership_percentage_of_total_commitment);

        System.out.println("\n");

        System.out.println("Beginning Balance - Quarter: " + BeginningBalance_Quarter);
        System.out.println("Beginning Balance - Since Inception: " + BeginningBalance_SI);

        System.out.println("\n");

        System.out.println("Capital Call - Quarter: " + CapitalCall_Quarter);
        System.out.println("Capital Call - Since Inception: " + CapitalCall_SI);

        System.out.println("\n");

        System.out.println("Distribution - Quarter: " + Distributions_Quarter);
        System.out.println("Distribution - Since Inception: " + Distributions_SI);

        System.out.println("\n");

        System.out.println("Transfers - Quarter: " + Transfers_Quarter);
        System.out.println("Transfers - Since Inception: " + Transfers_SI);

        System.out.println("\n");

        System.out.println("Net Income - Quarter: " + NetIncome_Quarter);
        System.out.println("Net Income - Since Inception: " + NetIncome_SI);

        System.out.println("\n");

        System.out.println("End Balance - Quarter: " + EndingBalance_Quarter);
        System.out.println("End Balance - Since Inception: " + EndingBalance_SI);

        System.out.println("\n");

    }
}
