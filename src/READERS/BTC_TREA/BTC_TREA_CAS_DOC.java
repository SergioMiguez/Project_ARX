package READERS.BTC_TREA;

import READERS.Generic_DOC_DOCX_Reader;
import READERS.Generic_Process_DOC;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Objects;

public class BTC_TREA_CAS_DOC extends Generic_Process_DOC {

    private Double Investment_Commitment, Total_Fund_Size;
    private Double CC_Quarter, CC_YTD, CC_SI;
    private Double CC_Inside_Investment_Quarter, CC_Inside_Investment_YTD, CC_Inside_Investment_SI;
    private Double G_Distribution_Quarter, G_Distribution_YTD, G_Distribution_SI;
    private Double G_Distribution_Interest_Quarter, G_Distribution_Interest_YTD, G_Distribution_Interest_SI;
    private Double N_Distribution_Quarter, N_Distribution_YTD, N_Distribution_SI;
    private Double N_Distribution_ReCALL_Quarter, N_Distribution_ReCALL_YTD, N_Distribution_ReCALL_SI;
    private Double Unfunded_Commitment_SI;

    public BTC_TREA_CAS_DOC(Path path){
        super();
        generalProcess(path);
    }

    @Override
    public void generalProcess(Path path) {
        super.generalProcess(path);
    }

    @Override
    public void value_Assigner(ArrayList<Double> numbersArray) {

        Investment_Commitment = numbersArray.get(2);
        Total_Fund_Size = numbersArray.get(3);
        CC_Quarter = numbersArray.get(4);
        CC_YTD = numbersArray.get(5);
        CC_SI = numbersArray.get(6);
        CC_Inside_Investment_Quarter = numbersArray.get(7);
        CC_Inside_Investment_YTD = numbersArray.get(8);
        CC_Inside_Investment_SI = numbersArray.get(9);
        G_Distribution_Quarter = numbersArray.get(10);
        G_Distribution_YTD = numbersArray.get(11);
        G_Distribution_SI = numbersArray.get(12);
        G_Distribution_Interest_Quarter = numbersArray.get(19);
        G_Distribution_Interest_YTD = numbersArray.get(20);
        G_Distribution_Interest_SI = numbersArray.get(21);
        N_Distribution_Quarter = numbersArray.get(28);
        N_Distribution_YTD = numbersArray.get(29);
        N_Distribution_SI = numbersArray.get(30);
        N_Distribution_ReCALL_Quarter = numbersArray.get(31);
        N_Distribution_ReCALL_YTD = numbersArray.get(32);
        N_Distribution_ReCALL_SI = numbersArray.get(33);
        Unfunded_Commitment_SI = numbersArray.get(34);
    }

    @Override
    public void print_all_info(ArrayList<Double> numbersArray) {

        System.out.println("\n");

        System.out.println("Investment Commitment: " + Investment_Commitment);
        System.out.println("Total Fund Size: " + Total_Fund_Size);

        System.out.println("\n");

        System.out.println("Capital Call - Quarter: " + CC_Quarter);
        System.out.println("Capital Call - YTD: " + CC_YTD);
        System.out.println("Capital Call - Since Inception: " + CC_SI);

        System.out.println("\n");

        System.out.println("Capital Call (Inside Investment) - Quarter: " + CC_Inside_Investment_Quarter);
        System.out.println("Capital Call (Inside Investment) - YTD: " + CC_Inside_Investment_YTD);
        System.out.println("Capital Call (Inside Investment) - Since Inception: " + CC_Inside_Investment_SI);

        System.out.println("\n");

        System.out.println("Gross Distribution - Quarter: " + G_Distribution_Quarter);
        System.out.println("Gross Distribution - YTD: " + G_Distribution_YTD);
        System.out.println("Gross Distribution - Since Inception: " + G_Distribution_SI);

        System.out.println("\n");

        System.out.println("Gross Distribution (Interest) - Quarter: " + G_Distribution_Interest_Quarter);
        System.out.println("Gross Distribution (Interest) - YTD: " + G_Distribution_Interest_YTD);
        System.out.println("Gross Distribution (Interest) - Since Inception: " + G_Distribution_Interest_SI);

        System.out.println("\n");

        System.out.println("Net Distribution - Quarter: " + N_Distribution_Quarter);
        System.out.println("Net Distribution - YTD: " + N_Distribution_YTD);
        System.out.println("Net Distribution - Since Inception: " + N_Distribution_SI);

        System.out.println("\n");

        System.out.println("Net Distribution (Recallable) - Quarter: " + N_Distribution_ReCALL_Quarter);
        System.out.println("Net Distribution (Recallable) - YTD: " + N_Distribution_ReCALL_YTD);
        System.out.println("Net Distribution (Recallable) - Since Inception: " + N_Distribution_ReCALL_SI);

        System.out.println("\n");

        System.out.println("Unfunded Commitment: " + Unfunded_Commitment_SI);
    }

}