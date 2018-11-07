import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int C, x;
		String rajesh, sheldon;
		C = teclado.nextInt();
		for (x = 0; x < C; x++){
			rajesh = teclado.next();
			sheldon = teclado.next();
			if (rajesh.equals("tesoura") && (sheldon.equals("papel"))){
				System.out.println("rajesh");
			}else{
				if (rajesh.equals("papel") && (sheldon.equals("tesoura"))){
					System.out.println("sheldon");
				}else{
					if (rajesh.equals("pedra") && (sheldon.equals("papel"))){
						System.out.println("sheldon");
					}else{
						if(rajesh.equals("papel") && (sheldon.equals("pedra"))){
							System.out.println("rajesh");
							}else{
								if(rajesh.equals("pedra") && (sheldon.equals("lagarto"))){
									System.out.println("rajesh");
								}else{
									if(rajesh.equals("lagarto") && (sheldon.equals("pedra"))){
										System.out.println("sheldon");
									}else{
										if(rajesh.equals("lagarto") && (sheldon.equals("spock"))){
											System.out.println("rajesh");
										}else{
											if(rajesh.equals("spock") && (sheldon.equals("lagarto"))){
												System.out.println("sheldon");
											}else{
												if(rajesh.equals("spock") && (sheldon.equals("tesoura"))){
													System.out.println("rajesh");
												}else{
													if(rajesh.equals("tesoura") && (sheldon.equals("spock"))){
														System.out.println("sheldon");
													}else{
														if(rajesh.equals("tesoura") && (sheldon.equals("lagarto"))){
															System.out.println("rajesh");
															}else{
																if(rajesh.equals("lagarto") && (sheldon.equals("tesoura"))){
																	System.out.println("sheldon");
																	}else{
																		if(rajesh.equals("lagarto") && (sheldon.equals("papel"))){
																			System.out.println("rajesh");
																		}else{
																			if(rajesh.equals("papel") && (sheldon.equals("lagarto"))){
																				System.out.println("sheldon");
																				}else{
																					if(rajesh.equals("papel") && (sheldon.equals("spock"))){
																						System.out.println("rajesh");
																					}else{
																						if(rajesh.equals("spock") && (sheldon.equals("papel"))){
																							System.out.println("sheldon");
																						}else{
																							if(rajesh.equals("spock") && (sheldon.equals("pedra"))){
																								System.out.println("rajesh");
																							}else{
																								if(rajesh.equals("pedra") && (sheldon.equals("spock"))){
																									System.out.println("sheldon");
																								}else{
																									if(rajesh.equals("pedra") && (sheldon.equals("tesoura"))){
																										System.out.println("rajesh");
																									}else{
																										if(rajesh.equals("tesoura") && (sheldon.equals("pedra"))){
																											System.out.println("sheldon");
																										}else{
																											System.out.println("empate");
																												
																										}
																									}
																								}
																							}
																						}
																					
																				}
																			}
																		}
																	}
															}
													}
												}
											}
										}
									}
								}
							}
					}
				}
			}
		}
	}
}
