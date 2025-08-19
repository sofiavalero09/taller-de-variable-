 tallervariable {
    public static void main(String[] args) {
        double d1, d2, d3;
        double t1, t2, t3;
        double l1, l2, l3;
        double precioLitro;
        double masaCargaKg;
        double largo, ancho, alto;
        double p1, p2, p3;
        double deprecPorKm;
        double volCamionM3;
        double fCO2;
        double galPorLitro;
        double vmin, vmax;
        double va, vb, ca, cb;
        double a, b, c;
        double w1, w2, w3, w4;

        double v1 = d1 / t1;
        double v2 = d2 / t2;
        double v3 = d3 / t3;
        double vprom = (d1 * v1 + d2 * v2 + d3 * v3) / (d1 + d2 + d3);

        double kml1 = d1 / l1;
        double kml2 = d2 / l2;
        double kml3 = d3 / l3;
        double kmltotal = (d1 + d2 + d3) / (l1 + l2 + l3);

        double costoComb = (l1 + l2 + l3) * precioLitro;
        double deprec = (d1 + d2 + d3) * deprecPorKm;
        double peajes = p1 + p2 + p3;
        double costoDirecto = costoComb + deprec + peajes;
        double costoPorKm = costoDirecto / (d1 + d2 + d3);

        double volumenM3 = largo * ancho * alto;
        double densidad = masaCargaKg / volumenM3;
        double ocupacion = volumenM3 / volCamionM3;

        double COTotal = (l1 + l2 + l3) * fCO2;
        double COporKm = COTotal / (d1 + d2 + d3);

        double vms = vprom * 1000 / 3600;
        double galTot = (l1 + l2 + l3) * galPorLitro;
        double vnorm = (vprom - vmin) / (vmax - vmin);

        double vmedia = (v1 + v2 + v3) / 3.0;
        double sigma = Math.sqrt(((v1 - vmedia) * (v1 - vmedia)
                                + (v2 - vmedia) * (v2 - vmedia)
                                + (v3 - vmedia) * (v3 - vmedia)) / 3.0);
        double vpond_t = (t1 * v1 + t2 * v2 + t3 * v3) / (t1 + t2 + t3);

        double c_vprom = ca + (cb - ca) * (vprom - va) / (vb - va);
        double costoMant = c_vprom * (d1 + d2 + d3);

        double kmlModelo = a * vprom * vprom + b * vprom + c;
        double litrosModelo = (d1 + d2 + d3) / kmlModelo;

        double score = w1 * (1 / costoPorKm)
                     + w2 * kmltotal
                     + w3 * (1 / COporKm)
                     + w4 * (1 / (1 + sigma));

        System.out.println("Velocidad promedio: " + vprom);
        System.out.println("Rendimiento total: " + kmltotal);
        System.out.println("Costo por km: " + costoPorKm);
        System.out.println("Volumen carga: " + volumenM3);
        System.out.println("Emisiones CO2: " + COTotal);
        System.out.println("Velocidad normalizada: " + vnorm);
        System.out.println("Desviación estándar: " + sigma);
        System.out.println("Costo mantenimiento: " + costoMant);
        System.out.println("Modelo kml(v): " + kmlModelo);
        System.out.println("Score: " + score);
    }
}
}
